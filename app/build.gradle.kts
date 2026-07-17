name: Build APK

on:
  push:
    branches: [ "main", "master", "develop" ]
  pull_request:
    branches: [ "main", "master", "develop" ]
  workflow_dispatch: # يتيح لك تشغيل البناء يدوياً من موقع GitHub في أي وقت

jobs:
  build:
    name: Build Android Debug APK
    runs-on: ubuntu-latest

    steps:
      # 1. سحب الكود من المستودع
      - name: Checkout Code
        uses: actions/checkout@v4

      # 2. إعداد بيئة جافا (مشروعك يعتمد على JavaVersion.VERSION_17)
      - name: Set up JDK 17
        uses: actions/setup-java@v4
        with:
          java-version: '17'
          distribution: 'temurin' # النسخة الأكثر استقراراً ودعماً لمشاريع أندرويد

      # 3. إعداد أداة Gradle الرسمية للـ Caching الذكي لتسريع البناء اللاحق
      - name: Setup Gradle
        uses: gradle/actions/setup-gradle@v3

      # 4. حقن إعدادات تقييد وتخصيص الذاكرة برمجياً قبل بدء البناء
      - name: Configure Gradle Memory & Optimizations
        run: |
          # التأكد من وجود ملف gradle.properties أو إنشائه
          touch gradle.properties
          
          # كتابة إعدادات تخصيص الذاكرة والسرعة
          echo "org.gradle.jvmargs=-Xmx4096m -XX:+UseParallelGC -XX:MaxMetaspaceSize=1g -Dfile.encoding=UTF-8" >> gradle.properties
          echo "kotlin.daemon.jvmopts=-Xmx2048m" >> gradle.properties
          echo "org.gradle.parallel=true" >> gradle.properties
          echo "org.gradle.caching=true" >> gradle.properties
          
          # عرض الإعدادات المطبقة في الـ Console للتأكد
          echo "=== Current Applied Gradle Properties ==="
          cat gradle.properties

      # 5. منح صلاحيات التشغيل لملف gradlew
      - name: Grant Execute Permission to Gradlew
        run: chmod +x gradlew

      # 6. تشغيل عملية البناء الفعلية لتوليد الـ APK
      - name: Build Debug APK
        env:
          # تأكيد إضافي عبر متغيرات البيئة لإجبار نظام الـ Java Virtual Machine على الالتزام بحد الـ 4G
          GRADLE_OPTS: -Dorg.gradle.jvmargs="-Xmx4096m -XX:+UseParallelGC"
        run: ./gradlew assembleDebug --stacktrace

      # 7. رفع ملف الـ APK الناتج كأثر (Artifact) لتتمكن من تحميله مباشرة من الصفحة
      - name: Upload APK Artifact
        uses: actions/upload-artifact@v4
        with:
          name: Fuel-Station-Debug-APK
          path: app/build/outputs/apk/debug/app-debug.apk
          retention-days: 7 # سيتم الاحتفاظ بالملف على GitHub لمدة 7 أيام للتنزيل
