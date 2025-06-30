//D.
//Dependency inversion
//Principio de inversão de dependencia
//modulos alto nivel nao podem depender de baixo nivel - Dependa de abstrações, não de implementações

/* Exemplo errado */
class Email{
    fun notificar(destinatario:String, txt: String){
        //Enviar email
    }
}

class Notificador{
    val service = Email()
    val serviceSms = Sms()

    fun enviar(destinatario:String, txt: String){
        service.notificar(destinatario,txt)
    }
}

/* Exemplo correto */
implement ServicoNotificacao {
    fun notificar(destinatario:String, txt: String){}
}

class EmailServiceNotification: ServicoNotificacao {
    override notificar(destinatario:String, txt: String){
        //Enviar email
    }
}

class SmsServiceNotification: ServicoNotificacao {
    override notificar(destinatario:String, txt: String){
        //Enviar sms
    }
}

class Notificador(service: ServicoNotificacao) {
    fun notificar(destinatario:String, txt: String){
        service.notificar(destinatario:String, txt: String)
    }
}

class main(){
    val notificadorEmail = Notificador(EmailServiceNotification())
    notificadorEmail.notificar("joao@email.com", "Sua fatura venceu!")

    val notificadorSms = Notificador(SmsServiceNotification())
    notificadorSms.notificadorSms("6198111112","Codigo de verificacao")
}