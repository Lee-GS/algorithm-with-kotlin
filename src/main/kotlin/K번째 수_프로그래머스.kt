
fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = IntArray(commands.size)

    for(i in answer.indices){
        var tempArray = array.slice(commands[i][0]-1 until commands[i][1])
        tempArray = tempArray.sorted()
        answer[i] = tempArray[commands[i][2]-1]
    }

    return answer
}
