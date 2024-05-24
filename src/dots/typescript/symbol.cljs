(ns dots.typescript.symbol
  (:refer-clojure :exclude [name]))

(defn flags
  ^js [symbol]
  (.-flags ^js symbol))

(defn set-flags!
  ^js [symbol value]
  (set! (.-flags ^js symbol) value))

(defn escaped-name
  ^js [symbol]
  (.-escapedName ^js symbol))

(defn set-escaped-name!
  ^js [symbol value]
  (set! (.-escapedName ^js symbol) value))

(defn declarations
  ^js [symbol]
  (.-declarations ^js symbol))

(defn set-declarations!
  ^js [symbol value]
  (set! (.-declarations ^js symbol) value))

(defn value-declaration
  ^js [symbol]
  (.-valueDeclaration ^js symbol))

(defn set-value-declaration!
  ^js [symbol value]
  (set! (.-valueDeclaration ^js symbol) value))

(defn members
  ^js [symbol]
  (.-members ^js symbol))

(defn set-members!
  ^js [symbol value]
  (set! (.-members ^js symbol) value))

(defn exports
  ^js [symbol]
  (.-exports ^js symbol))

(defn set-exports!
  ^js [symbol value]
  (set! (.-exports ^js symbol) value))

(defn global-exports
  ^js [symbol]
  (.-globalExports ^js symbol))

(defn set-global-exports!
  ^js [symbol value]
  (set! (.-globalExports ^js symbol) value))

(defn name
  ^js [symbol]
  (.-name ^js symbol))

(defn get-flags
  "**Returns:** `SymbolFlags`"
  ^js [symbol]
  (.getFlags ^js symbol))

(defn get-escaped-name
  "**Returns:** `__String`"
  ^js [symbol]
  (.getEscapedName ^js symbol))

(defn get-name
  "**Returns:** `string`"
  ^js [symbol]
  (.getName ^js symbol))

(defn get-declarations
  "**Returns:** `Declaration[] | undefined`"
  ^js [symbol]
  (.getDeclarations ^js symbol))

(defn documentation-comment
  "**Parameters:**
   - `type-checker`: `TypeChecker | undefined`
   
   **Returns:** `SymbolDisplayPart[]`"
  (^js [symbol]
   (.getDocumentationComment ^js symbol))
  (^js [symbol type-checker]
   (.getDocumentationComment ^js symbol type-checker)))

(defn js-doc-tags
  "**Parameters:**
   - `checker`: `TypeChecker | undefined`
   
   **Returns:** `JSDocTagInfo[]`"
  (^js [symbol]
   (.getJsDocTags ^js symbol))
  (^js [symbol checker]
   (.getJsDocTags ^js symbol checker)))
