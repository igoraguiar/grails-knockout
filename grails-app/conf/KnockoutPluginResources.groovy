import org.codehaus.groovy.grails.commons.ApplicationHolder
import org.codehaus.groovy.grails.plugins.GrailsPlugin
import org.codehaus.groovy.grails.plugins.GrailsPluginManager

/**
 * Based on http://plugins.grails.org/grails-jquery-ui/tags/RELEASE_1_8_15/grails-app/conf/JqueryUiPluginResources.groovy
 * @autor igor
 * Date: 8/29/11
 * Time: 1:54 PM
 */

def appCtx = ApplicationHolder.application.mainContext
String pluginName = 'knockoutjs'
GrailsPluginManager pluginManager = appCtx.pluginManager
GrailsPlugin plugin = pluginManager.getGrailsPlugin(pluginName)

String koStableVersion = plugin.instance.koStable
String koUnstableVersion = plugin.instance.koUnstable

String stableFileName = "knockout-${koStableVersion}.js"
String stableDevFileName = "knockout-${koStableVersion}.debug.js"
String unstableFileName = "knockout-${koUnstableVersion}.js"
String unstableDevFileName = "knockout-${koUnstableVersion}.debug.js"

modules = {
    'knockout' {
        resource id: 'js', url:[plugin: pluginName, dir: 'js/knockoutjs', file: stableFileName], disposition: 'head'
    }
    'knockout-dev' {
        resource id: 'js', url:[plugin: pluginName, dir: 'js/knockoutjs', file: stableDevFileName], disposition: 'head'
    }
    'knockout-unstable' {
        resource id: 'js', url:[plugin: pluginName, dir: 'js/knockoutjs', file: unstableFileName], disposition: 'head'
    }
    'knockout-unstable-dev' {
        resource id: 'js', url:[plugin: pluginName, dir: 'js/knockoutjs', file: unstableDevFileName], disposition: 'head'
    }
}