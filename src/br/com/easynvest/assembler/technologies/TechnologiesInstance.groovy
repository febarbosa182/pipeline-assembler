package br.com.easynvest.assembler.technologies

import br.com.easynvest.assembler.technologies.Angular
import br.com.easynvest.assembler.technologies.DotnetCore
import br.com.easynvest.assembler.technologies.Node
import br.com.easynvest.assembler.technologies.TechnologiesInterface

enum TechnologiesInstance{
    ANGULAR(Angular.class),
    DOTNETCORE(DotnetCore.class),
    NODE(Node.class),

    Class<TechnologiesInterface> technologiesInstance;

    TechnologiesInstance(Class<TechnologiesInterface> technologiesInstance){
        this.technologiesInstance=technologiesInstance
    }

    Class<TechnologiesInterface> getTechnologiesInstance(){
        return technologiesInstance.newInstance()
    }

}
