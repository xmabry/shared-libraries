def call(Map params = [:]) {
    String message = params.message
    String ok = params.get('ok', null)

    timeout(time: 20, unit: 'SECONDS') {
        /* invoke the built-in input step */
        return steps.input(message: message,
          ok: ok)
    }
}
/* Convenience overload */
def call(String message) {
    return call(message: message)
}
