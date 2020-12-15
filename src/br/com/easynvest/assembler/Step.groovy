package br.com.easynvest.assembler

class Step{
    def stepObject;
    def stepName;

    Step(stepObject, stepName){
        this.stepObject = stepObject;
        this.stepName = stepName;
    }

    def execStep(context, jobParams){
        stepObject.call(context, jobParams)
    }

    def getName(){
        return stepName
    }
}
