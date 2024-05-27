(ns dots.typescript.server.protocol.quick-info-response-body
  "Body of QuickInfoResponse.")

(defn kind
  "The symbol's kind (such as 'className' or 'parameterName' or plain 'text').
   
   **Returns:** `ScriptElementKind`"
  ^js [quick-info-response-body]
  (.-kind ^js quick-info-response-body))

(defn set-kind!
  "The symbol's kind (such as 'className' or 'parameterName' or plain 'text')."
  ^js [quick-info-response-body value]
  (set! (.-kind ^js quick-info-response-body) value))

(defn kind-modifiers
  "Optional modifiers for the kind (such as 'public').
   
   **Returns:** `string`"
  ^js [quick-info-response-body]
  (.-kindModifiers ^js quick-info-response-body))

(defn set-kind-modifiers!
  "Optional modifiers for the kind (such as 'public')."
  ^js [quick-info-response-body value]
  (set! (.-kindModifiers ^js quick-info-response-body) value))

(defn start
  "Starting file location of symbol.
   
   **Returns:** `Location`"
  ^js [quick-info-response-body]
  (.-start ^js quick-info-response-body))

(defn set-start!
  "Starting file location of symbol."
  ^js [quick-info-response-body value]
  (set! (.-start ^js quick-info-response-body) value))

(defn end
  "One past last character of symbol.
   
   **Returns:** `Location`"
  ^js [quick-info-response-body]
  (.-end ^js quick-info-response-body))

(defn set-end!
  "One past last character of symbol."
  ^js [quick-info-response-body value]
  (set! (.-end ^js quick-info-response-body) value))

(defn display-string
  "Type and kind of symbol.
   
   **Returns:** `string`"
  ^js [quick-info-response-body]
  (.-displayString ^js quick-info-response-body))

(defn set-display-string!
  "Type and kind of symbol."
  ^js [quick-info-response-body value]
  (set! (.-displayString ^js quick-info-response-body) value))

(defn documentation
  "Documentation associated with symbol.
   Display parts when UserPreferences.displayPartsForJSDoc is true, flattened to string otherwise.
   
   **Returns:** `string | SymbolDisplayPart[]`"
  ^js [quick-info-response-body]
  (.-documentation ^js quick-info-response-body))

(defn set-documentation!
  "Documentation associated with symbol.
   Display parts when UserPreferences.displayPartsForJSDoc is true, flattened to string otherwise."
  ^js [quick-info-response-body value]
  (set! (.-documentation ^js quick-info-response-body) value))

(defn tags
  "JSDoc tags associated with symbol.
   
   **Returns:** `JSDocTagInfo[]`"
  ^js [quick-info-response-body]
  (.-tags ^js quick-info-response-body))

(defn set-tags!
  "JSDoc tags associated with symbol."
  ^js [quick-info-response-body value]
  (set! (.-tags ^js quick-info-response-body) value))
