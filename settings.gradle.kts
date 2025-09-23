rootProject.name = "spring_ecosystem"

include("practice:session_001")
findProject(":practice:session_001")?.name = "session_001"
