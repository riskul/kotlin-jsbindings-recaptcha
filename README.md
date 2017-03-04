# kotlin-jsbindings-recaptcha
Kotlin bindings for https://www.google.com/recaptcha
reCaptcha version 2.0
## Usage
1) Add as dependency

2) Add https://www.google.com/recaptcha/api.js to scripts
```html
    <!-- here -->
    <script src='https://www.google.com/recaptcha/api.js'></script>
    <script type="text/javascript" src="lib/kotlin.js"></script>

```
2) Put script tag after Kotlin's script tag
```html
    <script type="text/javascript" src="lib/kotlin.js"></script>
    <!-- here -->
    <script type="text/javascript" src="lib/recaptcha.js"></script>
```
3) Write code:
```javascript
        val reCaptcha = grecaptcha.render(container,
                ReCaptchaParameters("sitekey",
                        callback = { token -> js("alert(token)") }) 
```
