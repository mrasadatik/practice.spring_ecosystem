rootProject.name = "spring_ecosystem"

include("practice:session_001")
findProject(":practice:session_001")?.name = "session_001"
include("practice:session_002")
findProject(":practice:session_002")?.name = "session_002"
