import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def str = CustomKeywords.'my.a.Greeting.greet'("Drunda")
WebUI.comment(">>> ${str}")
