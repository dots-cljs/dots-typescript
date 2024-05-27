(ns dots.typescript.diagnostic-message-chain
  "A linked list of formatted diagnostic messages to be used as part of a multiline message.
   It is built from the bottom up, leaving the head to be the \"main\" diagnostic.
   While it seems that DiagnosticMessageChain is structurally similar to DiagnosticMessage,
   the difference is that messages are all preformatted in DMC."
  (:refer-clojure :exclude [next]))

(defn message-text
  "**Returns:** `string`"
  ^js [diagnostic-message-chain]
  (.-messageText ^js diagnostic-message-chain))

(defn set-message-text!
  ^js [diagnostic-message-chain value]
  (set! (.-messageText ^js diagnostic-message-chain) value))

(defn category
  "**Returns:** `DiagnosticCategory`"
  ^js [diagnostic-message-chain]
  (.-category ^js diagnostic-message-chain))

(defn set-category!
  ^js [diagnostic-message-chain value]
  (set! (.-category ^js diagnostic-message-chain) value))

(defn code
  "**Returns:** `number`"
  ^js [diagnostic-message-chain]
  (.-code ^js diagnostic-message-chain))

(defn set-code!
  ^js [diagnostic-message-chain value]
  (set! (.-code ^js diagnostic-message-chain) value))

(defn next
  "**Returns:** `DiagnosticMessageChain[] | undefined`"
  ^js [diagnostic-message-chain]
  (.-next ^js diagnostic-message-chain))

(defn set-next!
  ^js [diagnostic-message-chain value]
  (set! (.-next ^js diagnostic-message-chain) value))
