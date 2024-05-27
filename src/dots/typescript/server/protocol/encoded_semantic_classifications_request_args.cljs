(ns dots.typescript.server.protocol.encoded-semantic-classifications-request-args
  "Arguments for EncodedSemanticClassificationsRequest request.")

(defn start
  "Start position of the span.
   
   **Returns:** `number`"
  ^js [encoded-semantic-classifications-request-args]
  (.-start ^js encoded-semantic-classifications-request-args))

(defn set-start!
  "Start position of the span."
  ^js [encoded-semantic-classifications-request-args value]
  (set! (.-start ^js encoded-semantic-classifications-request-args) value))

(defn length
  "Length of the span.
   
   **Returns:** `number`"
  ^js [encoded-semantic-classifications-request-args]
  (.-length ^js encoded-semantic-classifications-request-args))

(defn set-length!
  "Length of the span."
  ^js [encoded-semantic-classifications-request-args value]
  (set! (.-length ^js encoded-semantic-classifications-request-args) value))

(defn format
  "Optional parameter for the semantic highlighting response, if absent it
   defaults to \"original\".
   
   **Returns:** `\"original\" | \"2020\" | undefined`"
  ^js [encoded-semantic-classifications-request-args]
  (.-format ^js encoded-semantic-classifications-request-args))

(defn set-format!
  "Optional parameter for the semantic highlighting response, if absent it
   defaults to \"original\"."
  ^js [encoded-semantic-classifications-request-args value]
  (set! (.-format ^js encoded-semantic-classifications-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [encoded-semantic-classifications-request-args]
  (.-file ^js encoded-semantic-classifications-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [encoded-semantic-classifications-request-args value]
  (set! (.-file ^js encoded-semantic-classifications-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [encoded-semantic-classifications-request-args]
  (.-projectFileName ^js encoded-semantic-classifications-request-args))

(defn set-project-file-name!
  ^js [encoded-semantic-classifications-request-args value]
  (set! (.-projectFileName ^js encoded-semantic-classifications-request-args) value))
