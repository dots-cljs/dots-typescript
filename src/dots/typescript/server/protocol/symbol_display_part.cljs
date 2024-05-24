(ns dots.typescript.server.protocol.symbol-display-part
  "Part of a symbol description.")

(defn text
  "Text of an item describing the symbol."
  ^js [symbol-display-part]
  (.-text ^js symbol-display-part))

(defn set-text!
  "Text of an item describing the symbol."
  ^js [symbol-display-part value]
  (set! (.-text ^js symbol-display-part) value))

(defn kind
  "The symbol's kind (such as 'className' or 'parameterName' or plain 'text')."
  ^js [symbol-display-part]
  (.-kind ^js symbol-display-part))

(defn set-kind!
  "The symbol's kind (such as 'className' or 'parameterName' or plain 'text')."
  ^js [symbol-display-part value]
  (set! (.-kind ^js symbol-display-part) value))
