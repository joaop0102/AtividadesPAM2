import javax.sound.sampled.Line

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
   var opcao: Int = 0

    while (opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção ${opcao}")
    }
    println("Até a próxima!")
}