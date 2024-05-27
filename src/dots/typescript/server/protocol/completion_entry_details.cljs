(ns dots.typescript.server.protocol.completion-entry-details
  "Additional completion entry details, available on demand"
  (:refer-clojure :exclude [name]))

(defn name
  "The symbol's name.
   
   **Returns:** `string`"
  ^js [completion-entry-details]
  (.-name ^js completion-entry-details))

(defn set-name!
  "The symbol's name."
  ^js [completion-entry-details value]
  (set! (.-name ^js completion-entry-details) value))

(defn kind
  "The symbol's kind (such as 'className' or 'parameterName').
   
   **Returns:** `ScriptElementKind`"
  ^js [completion-entry-details]
  (.-kind ^js completion-entry-details))

(defn set-kind!
  "The symbol's kind (such as 'className' or 'parameterName')."
  ^js [completion-entry-details value]
  (set! (.-kind ^js completion-entry-details) value))

(defn kind-modifiers
  "Optional modifiers for the kind (such as 'public').
   
   **Returns:** `string`"
  ^js [completion-entry-details]
  (.-kindModifiers ^js completion-entry-details))

(defn set-kind-modifiers!
  "Optional modifiers for the kind (such as 'public')."
  ^js [completion-entry-details value]
  (set! (.-kindModifiers ^js completion-entry-details) value))

(defn display-parts
  "Display parts of the symbol (similar to quick info).
   
   **Returns:** `SymbolDisplayPart[]`"
  ^js [completion-entry-details]
  (.-displayParts ^js completion-entry-details))

(defn set-display-parts!
  "Display parts of the symbol (similar to quick info)."
  ^js [completion-entry-details value]
  (set! (.-displayParts ^js completion-entry-details) value))

(defn documentation
  "Documentation strings for the symbol.
   
   **Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [completion-entry-details]
  (.-documentation ^js completion-entry-details))

(defn set-documentation!
  "Documentation strings for the symbol."
  ^js [completion-entry-details value]
  (set! (.-documentation ^js completion-entry-details) value))

(defn tags
  "JSDoc tags for the symbol.
   
   **Returns:** `JSDocTagInfo[] | undefined`"
  ^js [completion-entry-details]
  (.-tags ^js completion-entry-details))

(defn set-tags!
  "JSDoc tags for the symbol."
  ^js [completion-entry-details value]
  (set! (.-tags ^js completion-entry-details) value))

(defn code-actions
  "The associated code actions for this entry
   
   **Returns:** `CodeAction[] | undefined`"
  ^js [completion-entry-details]
  (.-codeActions ^js completion-entry-details))

(defn set-code-actions!
  "The associated code actions for this entry"
  ^js [completion-entry-details value]
  (set! (.-codeActions ^js completion-entry-details) value))

(defn source
  "**Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [completion-entry-details]
  (.-source ^js completion-entry-details))

(defn set-source!
  ^js [completion-entry-details value]
  (set! (.-source ^js completion-entry-details) value))

(defn source-display
  "Human-readable description of the `source` from the CompletionEntry.
   
   **Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [completion-entry-details]
  (.-sourceDisplay ^js completion-entry-details))

(defn set-source-display!
  "Human-readable description of the `source` from the CompletionEntry."
  ^js [completion-entry-details value]
  (set! (.-sourceDisplay ^js completion-entry-details) value))
