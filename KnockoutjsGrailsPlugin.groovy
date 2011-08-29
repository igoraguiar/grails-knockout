class KnockoutjsGrailsPlugin {
    String groupId = 'br.com.geocontrol.grails.plugin.ko'
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.0 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "grails-app/views/index.gsp"
    ]

    def koStable='1.2.1'
    def koUnstable='1.3-20110826'

    def author = "Igor Aguiar Rodrigues"
    def authorEmail = "igor@geocontrol.com.br"
    def title = "Knockoutjs for Grails"
    def description = """Provides necessary Javascript files for using Knockoutjs (http://knockoutjs.com/) with grails.
Stable knockoutjs version: ${koStable}
Unstable knockoutjs version: ${koUnstable}
"""

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/grails-knockoutjs"

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // The event is the same as for 'onChange'.
    }
}
