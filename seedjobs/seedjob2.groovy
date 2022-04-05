pipelineJob('scripted2') {

  description('')

  displayName('scripted2')

  configure { flowdefinition ->

    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps@2683.vd0a_8f6a_1c263') {

      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {

        'configVersion'(2)

        'userRemoteConfigs' {

          'hudson.plugins.git.UserRemoteConfig' {

            'url'('https://gitlab.com/shubham.kalsait/b16-devops.git')

            'credentialsId'('gitlab-user-pwd')

          }

        }

        'branches' {

          'hudson.plugins.git.BranchSpec' {

            'name'('*/main')

          }

        }

        'doGenerateSubmoduleConfigurations'(false)

        'submoduleCfg'(class:'empty-list')

        'extensions'()

      }

      'scriptPath'('pipeline/scriptedPipeline.groovy')

      'lightweight'(true)

    }

  }

}