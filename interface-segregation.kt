//I.
//Interface Segregation
//Principio de segregação de interface
//Não forçar metodos que não utiliza

/* Exemplo errado */
interface Trabalhador {
    fun trabalhar(){}
    fun comer(){}
    fun dormir(){}
}

class Robo : Trabalhador {
    override fun trabalhar(){}
    override fun comer(){ throw UnsupportedOperationException("robo nao come") }
    override fun dormir(){throw UnsupportedOperationException("robo nao dorme")}
}

/* Exemplo correto */
interface Trabalhavel{
    fun trabalhar(){}
}
interface Comivel{
    fun comer(){}
}
interface Dormivel{
    fun dormir(){}
}

class Homem: Trabalhavel, Comivel, Dormivel{
    override fun trabalhar(){ }
    override fun comer(){ }
    override fun dormir(){ }
}

class Robo: Trabalhavel{
    override fun trabalhar(){ }
}
