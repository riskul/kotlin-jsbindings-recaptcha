package su.snx.kotlin.jsbindings.recaptcha

enum class ReCaptchaSize {
    NORMAL, COMPACT
}

enum class ReCaptchaTheme {
    LIGHT, DARK
}

enum class ReCaptchaType {
    IMAGE, AUDIO
}

class ReCaptchaParameters {
    var siteKey: String
        get() = asDynamic()["sitekey"]
        private set(value) {
            asDynamic()["sitekey"] = value
        }

    val theme: ReCaptchaTheme
    val type: ReCaptchaType
    val size: ReCaptchaSize
    val tabindex: Int

    val callback: (String) -> Unit
    var expiredCallback: () -> Unit
        get() = asDynamic()["expired-callback"]
        private set(value) {
            asDynamic()["expired-callback"] = value
        }

    constructor(siteKey: String,
                theme: ReCaptchaTheme = ReCaptchaTheme.LIGHT,
                type: ReCaptchaType = ReCaptchaType.IMAGE,
                size: ReCaptchaSize = ReCaptchaSize.NORMAL,
                tabindex: Int = 0,
                callback: (String) -> Unit = {},
                expiredCallback: () -> Unit = {}
    ) {
        this.siteKey = siteKey
        this.theme = theme
        this.type = type
        this.size = size
        this.tabindex = tabindex
        this.callback = callback
        this.expiredCallback = expiredCallback
    }
}