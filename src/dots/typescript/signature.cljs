(ns dots.typescript.signature)

(defn declaration
  ^js [signature]
  (.-declaration ^js signature))

(defn set-declaration!
  ^js [signature value]
  (set! (.-declaration ^js signature) value))

(defn type-parameters
  ^js [signature]
  (.-typeParameters ^js signature))

(defn set-type-parameters!
  ^js [signature value]
  (set! (.-typeParameters ^js signature) value))

(defn parameters
  ^js [signature]
  (.-parameters ^js signature))

(defn set-parameters!
  ^js [signature value]
  (set! (.-parameters ^js signature) value))

(defn this-parameter
  ^js [signature]
  (.-thisParameter ^js signature))

(defn set-this-parameter!
  ^js [signature value]
  (set! (.-thisParameter ^js signature) value))

(defn get-declaration
  "**Returns:** `SignatureDeclaration`"
  ^js [signature]
  (.getDeclaration ^js signature))

(defn get-type-parameters
  "**Returns:** `TypeParameter[] | undefined`"
  ^js [signature]
  (.getTypeParameters ^js signature))

(defn get-parameters
  "**Returns:** `Symbol[]`"
  ^js [signature]
  (.getParameters ^js signature))

(defn type-parameter-at-position
  "**Parameters:**
   - `pos`: `number`
   
   **Returns:** `Type`"
  ^js [signature pos]
  (.getTypeParameterAtPosition ^js signature pos))

(defn return-type
  "**Returns:** `Type`"
  ^js [signature]
  (.getReturnType ^js signature))

(defn documentation-comment
  "**Parameters:**
   - `type-checker`: `TypeChecker | undefined`
   
   **Returns:** `SymbolDisplayPart[]`"
  (^js [signature]
   (.getDocumentationComment ^js signature))
  (^js [signature type-checker]
   (.getDocumentationComment ^js signature type-checker)))

(defn js-doc-tags
  "**Returns:** `JSDocTagInfo[]`"
  ^js [signature]
  (.getJsDocTags ^js signature))
