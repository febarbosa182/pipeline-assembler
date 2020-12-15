package br.com.easynvest.assembler

import br.com.easynvest.assembler.Step
import br.com.easynvest.assembler.technologies.TechnologiesInstance
import br.com.easynvest.assembler.technologies.TechnologiesInterface

class Assembler{
    TechnologiesInterface technology

    def compose(jenkins, jobParams) {
        jenkins.echo "Pipeline Assemble!"

        technology = TechnologiesInstance
                .valueOf(jobParams.techType.toUpperCase())
                    .getTechnologiesInstance()

        technology.fillSteps(jenkins, jobParams)

    }

    def runSteps(jenkins, jobParams) {
        technology.stepList.each{
            jenkins.stage(it.getName()){
                it.execStep(jenkins, jobParams)
            }
        }
    }
}
