(ns dots.typescript.server.protocol.completions-request-args
  "Arguments for completions messages.")

(defn prefix
  "Optional prefix to apply to possible completions.
   
   **Returns:** `string | undefined`"
  ^js [completions-request-args]
  (.-prefix ^js completions-request-args))

(defn set-prefix!
  "Optional prefix to apply to possible completions."
  ^js [completions-request-args value]
  (set! (.-prefix ^js completions-request-args) value))

(defn trigger-character
  "Character that was responsible for triggering completion.
   Should be `undefined` if a user manually requested completion.
   
   **Returns:** `CompletionsTriggerCharacter | undefined`"
  ^js [completions-request-args]
  (.-triggerCharacter ^js completions-request-args))

(defn set-trigger-character!
  "Character that was responsible for triggering completion.
   Should be `undefined` if a user manually requested completion."
  ^js [completions-request-args value]
  (set! (.-triggerCharacter ^js completions-request-args) value))

(defn trigger-kind
  "**Returns:** `CompletionTriggerKind | undefined`"
  ^js [completions-request-args]
  (.-triggerKind ^js completions-request-args))

(defn set-trigger-kind!
  ^js [completions-request-args value]
  (set! (.-triggerKind ^js completions-request-args) value))

(defn include-external-module-exports?
  "**Returns:** `boolean | undefined`"
  ^js [completions-request-args]
  (.-includeExternalModuleExports ^js completions-request-args))

(defn set-include-external-module-exports!
  ^js [completions-request-args value]
  (set! (.-includeExternalModuleExports ^js completions-request-args) value))

(defn include-insert-text-completions?
  "**Returns:** `boolean | undefined`"
  ^js [completions-request-args]
  (.-includeInsertTextCompletions ^js completions-request-args))

(defn set-include-insert-text-completions!
  ^js [completions-request-args value]
  (set! (.-includeInsertTextCompletions ^js completions-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [completions-request-args]
  (.-line ^js completions-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [completions-request-args value]
  (set! (.-line ^js completions-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [completions-request-args]
  (.-offset ^js completions-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [completions-request-args value]
  (set! (.-offset ^js completions-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [completions-request-args]
  (.-file ^js completions-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [completions-request-args value]
  (set! (.-file ^js completions-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [completions-request-args]
  (.-projectFileName ^js completions-request-args))

(defn set-project-file-name!
  ^js [completions-request-args value]
  (set! (.-projectFileName ^js completions-request-args) value))
