(ns dots.typescript.server.protocol.span-of-enclosing-comment-request-args)

(defn only-multi-line?
  "Requires that the enclosing span be a multi-line comment, or else the request returns undefined.
   
   **Returns:** `boolean`"
  ^js [span-of-enclosing-comment-request-args]
  (.-onlyMultiLine ^js span-of-enclosing-comment-request-args))

(defn set-only-multi-line!
  "Requires that the enclosing span be a multi-line comment, or else the request returns undefined."
  ^js [span-of-enclosing-comment-request-args value]
  (set! (.-onlyMultiLine ^js span-of-enclosing-comment-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [span-of-enclosing-comment-request-args]
  (.-line ^js span-of-enclosing-comment-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [span-of-enclosing-comment-request-args value]
  (set! (.-line ^js span-of-enclosing-comment-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [span-of-enclosing-comment-request-args]
  (.-offset ^js span-of-enclosing-comment-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [span-of-enclosing-comment-request-args value]
  (set! (.-offset ^js span-of-enclosing-comment-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [span-of-enclosing-comment-request-args]
  (.-file ^js span-of-enclosing-comment-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [span-of-enclosing-comment-request-args value]
  (set! (.-file ^js span-of-enclosing-comment-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [span-of-enclosing-comment-request-args]
  (.-projectFileName ^js span-of-enclosing-comment-request-args))

(defn set-project-file-name!
  ^js [span-of-enclosing-comment-request-args value]
  (set! (.-projectFileName ^js span-of-enclosing-comment-request-args) value))
