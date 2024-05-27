(ns dots.typescript.completion-entry-details
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [completion-entry-details]
  (.-name ^js completion-entry-details))

(defn set-name!
  ^js [completion-entry-details value]
  (set! (.-name ^js completion-entry-details) value))

(defn kind
  "**Returns:** `ScriptElementKind`"
  ^js [completion-entry-details]
  (.-kind ^js completion-entry-details))

(defn set-kind!
  ^js [completion-entry-details value]
  (set! (.-kind ^js completion-entry-details) value))

(defn kind-modifiers
  "**Returns:** `string`"
  ^js [completion-entry-details]
  (.-kindModifiers ^js completion-entry-details))

(defn set-kind-modifiers!
  ^js [completion-entry-details value]
  (set! (.-kindModifiers ^js completion-entry-details) value))

(defn display-parts
  "**Returns:** `SymbolDisplayPart[]`"
  ^js [completion-entry-details]
  (.-displayParts ^js completion-entry-details))

(defn set-display-parts!
  ^js [completion-entry-details value]
  (set! (.-displayParts ^js completion-entry-details) value))

(defn documentation
  "**Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [completion-entry-details]
  (.-documentation ^js completion-entry-details))

(defn set-documentation!
  ^js [completion-entry-details value]
  (set! (.-documentation ^js completion-entry-details) value))

(defn tags
  "**Returns:** `JSDocTagInfo[] | undefined`"
  ^js [completion-entry-details]
  (.-tags ^js completion-entry-details))

(defn set-tags!
  ^js [completion-entry-details value]
  (set! (.-tags ^js completion-entry-details) value))

(defn code-actions
  "**Returns:** `CodeAction[] | undefined`"
  ^js [completion-entry-details]
  (.-codeActions ^js completion-entry-details))

(defn set-code-actions!
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
  "**Returns:** `SymbolDisplayPart[] | undefined`"
  ^js [completion-entry-details]
  (.-sourceDisplay ^js completion-entry-details))

(defn set-source-display!
  ^js [completion-entry-details value]
  (set! (.-sourceDisplay ^js completion-entry-details) value))
