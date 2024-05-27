(ns dots.typescript.server.protocol.brace-completion-request-args
  "Argument for BraceCompletionRequest request.")

(defn opening-brace
  "Kind of opening brace
   
   **Returns:** `string`"
  ^js [brace-completion-request-args]
  (.-openingBrace ^js brace-completion-request-args))

(defn set-opening-brace!
  "Kind of opening brace"
  ^js [brace-completion-request-args value]
  (set! (.-openingBrace ^js brace-completion-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [brace-completion-request-args]
  (.-line ^js brace-completion-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [brace-completion-request-args value]
  (set! (.-line ^js brace-completion-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [brace-completion-request-args]
  (.-offset ^js brace-completion-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [brace-completion-request-args value]
  (set! (.-offset ^js brace-completion-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [brace-completion-request-args]
  (.-file ^js brace-completion-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [brace-completion-request-args value]
  (set! (.-file ^js brace-completion-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [brace-completion-request-args]
  (.-projectFileName ^js brace-completion-request-args))

(defn set-project-file-name!
  ^js [brace-completion-request-args value]
  (set! (.-projectFileName ^js brace-completion-request-args) value))
