val projectName = "kotlinmailer"

rootProject.name = projectName

include("$projectName-core")

include("$projectName-client")
include("$projectName-html")

include("$projectName-test")

enableFeaturePreview("VERSION_CATALOGS")
