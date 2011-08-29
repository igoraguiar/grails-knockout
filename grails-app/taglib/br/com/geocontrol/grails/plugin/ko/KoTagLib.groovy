package br.com.geocontrol.grails.plugin.ko

import org.codehaus.groovy.grails.plugins.GrailsPluginManager
import org.codehaus.groovy.grails.plugins.GrailsPlugin
import grails.util.Environment

class KoTagLib {
    static namespace = "ko"
    static String pluginName = 'knockoutjs'
    GrailsPluginManager pluginManager

    def resources = { attrs, body ->
        GrailsPlugin plugin = pluginManager.getGrailsPlugin(pluginName)
        boolean unstable = attrs?.unstable ? attrs.unstable == 'true' : false
        boolean debug = Environment.current == Environment.DEVELOPMENT
        String koVersion = unstable ? plugin.instance.koUnstable : plugin.instance.koStable
        String fileName = "knockout-${koVersion}${debug ? '.debug' : ''}.js"
        out << """<script src="${g.resource(plugin: attrs.plugin ? attrs.plugin : pluginName, dir: "js/knockoutjs", file:fileName).encodeAsHTML()}" type="text/javascript"></script>"""
    }
}
