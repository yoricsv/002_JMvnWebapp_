## [002_JMvnWebapp_][DescPrj]

## <p align=center>[Project][DescPrj] | [Building][AutoBld] | [Installing][AutoInst] <br/> [Web-app][WebBld] | [Modularity][Module] | [Dependency][DepMng]</p>

<!--
* [Project description][DescPrj]
* [Project build automation][AutoBld]
* [Project setup automation][AutoInst]
* [Web application building][WebBld]
* [Project modularity][Module]
* [Dependency management][DepMng]
-->

[DescPrj]: README.md
[AutoBld]: res/read/Maven_BuildAutomation.md
[AutoInst]: res/read/Maven_SetupAutomation.md
[WebBld]: res/read/Maven_WebApplication.md
[Module]: res/read/Maven_ModularityProject.md
[DepMng]: res/read/Maven_DependencyManagement.md

---
<br/>
<!-- ---------------------------------- * Navigation * ---------------------------------- -->

# <p align=center><i>Project name:</i> "<b>Parking</b>"</p>

## Creation steps:
1. Set the Environment variables: JAVA_HOME and M2_HOME (see: [001_JMaven_][1])
1. Run the IntelliJ IDEA
2. Create `New project`<br/>
![NewProject][2]
3. Choose `Maven` -> Click button `[Next]`<br/>
![NewMavenProject][3]
4. Choose the **Location** (Exp.: `#_JavaEnterprise_`)
5. Type **Name** (Exp.: `002_JMvnWebapp_`)
6. Unroll the `Artifact Coordinates` *(click on it)*
7. Type GroupId: *domainL1*.*domainL2*.*domainL3* (Exp.: `pro.yoric.it`)
8. Type ArtifactId: *projectName* (Exp.: `Parking`)
9.  Type Version: *versionNumber* (Exp.: `4.0.23.7`)
10. Click button `[Finish]`<br/>
![NewMavenCoordinateProject][4]


<!--
* [001_JMaven_][1]
* ![NewProject][2]
* ![NewMavenProject][3]
* ![NewMavenCoordinateProject][4]
-->

[1]: https://github.com/yoricsv/001_JMaven_.git
[2]: res/img/IdeaNewProject.png
[3]: res/img/ConfigNewProject.png
[4]: res/img/ConfigNewProgectCoord.png