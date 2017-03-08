# kotlin-jsbindings-recaptcha
Kotlin bindings for https://www.google.com/recaptcha
reCaptcha version 2.0
## Usage
1) Add repository
```html
        <repository>
            <id>public</id>
            <name>Public Repo</name>
            <url>http://mvn.snx.su/repository/public/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
```     
2) Add dependency
```html
    <dependencies>
        <dependency>
            <groupId>su.snx.kotlin.jsbindings</groupId>
            <artifactId>recaptcha</artifactId>
            <version>x.x.x</version>
        </dependency>
    </dependencies>
```

3) Add https://www.google.com/recaptcha/api.js to scripts
```html
    <!-- here -->
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <script type="text/javascript" src="lib/kotlin.js"></script>

```
4) Put script tag after Kotlin's script tag
```html
    <script type="text/javascript" src="lib/kotlin.js"></script>
    <!-- here -->
    <script type="text/javascript" src="lib/recaptcha.js"></script>
```
5) Write code on Kotlin:
```javascript
        val reCaptcha = ReCaptcha(container,
                ReCaptchaParameters("siteKey",
                        callback = { token -> js("alert(token)") }) 
```
