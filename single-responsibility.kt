//S.
//Single Responsability
//Princípio da Responsabilidade Única
//"Cada coisa deve fazer só uma coisa."

/* Exemplo errado */

class Message {
    fun saveUser(user: User){}
    fun sendEmail(user: User){}
}

/* Exemplo certo */

class UserRepository {
    fun saveUser(user: User){
        //salva no banco de dados
    }
}

class EmailService {
    fun sendEmail(user: User){
        //enviar email
    }
}