// L.
// Liskov Principle
// Principio de Liskov de substituição
// pode substituir objetos da classe pai que nao quebrem a aplicação ou condicionais

/* Exemplo errado */
interface Ave(){
    fun voar(){
        print("bate asas e voa")
    }
}

class Andorinha : Ave {}

class Pinguim : Ave {
    override voar(){
        throw UnsupportedOperationException("Pinguim não voa!")
    }
}

/* Exemplo certo */
interface Ave

interface AveVoa : Ave {
    fun voar(){
        print("bate asas e voa")
    }
}

class Andorinha: AveVoa {

}

class Pinguim: Ave{

}



