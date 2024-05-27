(ns dots.typescript.server.protocol.encoded-semantic-classifications-response-body
  "Implementation response message. Gives series of text spans depending on the format ar.")

(defn end-of-line-state
  "**Returns:** `EndOfLineState`"
  ^js [encoded-semantic-classifications-response-body]
  (.-endOfLineState ^js encoded-semantic-classifications-response-body))

(defn set-end-of-line-state!
  ^js [encoded-semantic-classifications-response-body value]
  (set! (.-endOfLineState ^js encoded-semantic-classifications-response-body) value))

(defn spans
  "**Returns:** `number[]`"
  ^js [encoded-semantic-classifications-response-body]
  (.-spans ^js encoded-semantic-classifications-response-body))

(defn set-spans!
  ^js [encoded-semantic-classifications-response-body value]
  (set! (.-spans ^js encoded-semantic-classifications-response-body) value))
