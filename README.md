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

## Stages of creating a multi-module project:

### The steps:
1. Set the Environment variables: JAVA_HOME and M2_HOME (see: [001_JMaven_][1])
2. Run the IntelliJ IDEA
3. Create `New project`

### IntelliJ IDEA start window:
![NewProject][2]

4. Choose `Maven` -> Click button `[Next]`<br/>

### New project configuration window:
![NewMavenProject][3]

5. Choose the **Location** (Exp.: `#_JavaEnterprise_`)
6. Type **Name** (Exp.: `002_JMvnWebapp_`)
7. Unroll the `Artifact Coordinates` *(click on it)*
8. Type GroupId: *domainL1*.*domainL2*.*domainL3* (Exp.: `pro.yoric.it`)
9. Type ArtifactId: *projectName* (Exp.: `Parking`)
10. Type Version: *versionNumber* (Exp.: `4.0.23.7`)
11. Click button `[Finish]`<br/>

### New project configuration window:
![NewMavenCoordinateProject][4]

12. After cteation, need modify `pom.xml` file, add package type **pom**

```xml
<packaging>pom</packaging>
```

### To create additional modules: 
1. To create a new module do next: *File* -> *Project structure*<br/>

### Create New module:
![Create modules step 1][5]

2. Go to the `Modules` in content menu
3. Use sign `+` in the left of top side.
4. Choose `New module`<br/>

### Project structure configuration window:
![Create modules step 2][6]

5. Use the unrolling menu `Parent` if you wanna create a child from the other parant
6. Type a name of the module (Exp.: `controller`) and click `Finish` button

### New module configuration window:
![Create modules step 3][7]

> ***NOTE:*** The module name will be automatically added to the ArtifactId.<br/>
*Repeat these steps for each additional module*

### After all the manipulations, we get something like this into the main pom.xml file:
```xml
<modules>
    <module>ui</module>
    <module>controller</module>
    <module>data</module>
</modules>
```

### New project structure:
![New project structure][8]

<!--
* [001_JMaven_][1]
* ![NewProject][2]
* ![NewMavenProject][3]
* ![NewMavenCoordinateProject][4]
* ![Create modules][5]
-->

[1]: https://github.com/yoricsv/001_JMaven_.git
[2]: res/img/IdeaNewProject.png
[3]: res/img/ConfigNewProject.png
[4]: res/img/ConfigNewProgectCoord.png
[5]: res/img/CreateModules.png
[6]: res/img/CreateModulesS2.png
[7]: res/img/CreateModulesS3.png
[8]: res/img/POMProjectStructure.png