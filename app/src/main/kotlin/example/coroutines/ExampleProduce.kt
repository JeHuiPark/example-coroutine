package example.coroutines

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

suspend fun main() {
    coroutineScope {
        val receiveChannel = produce(
            capacity = Channel.Factory.CONFLATED
        ) {
            (0 until 5).forEach {
                println("before send value $it")
                send(it)
                println("sent value $it")
            }
        }
        delay(100)

//        before send value 0
//        sent value 0
//        before send value 1
//        sent value 1
//        before send value 2
//        sent value 2
//        before send value 3
//        sent value 3
//        before send value 4
//        sent value 4
        assert(receiveChannel.receive() == 5)
    }
}
