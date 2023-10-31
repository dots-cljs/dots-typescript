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

(defn get-declaration
  ^js [signature]
  (.getDeclaration ^js signature))

(defn get-type-parameters
  ^js [signature]
  (.getTypeParameters ^js signature))

(defn get-parameters
  ^js [signature]
  (.getParameters ^js signature))

(defn type-parameter-at-position
  ^js [signature pos]
  (.getTypeParameterAtPosition ^js signature pos))

(defn return-type
  ^js [signature]
  (.getReturnType ^js signature))

(defn documentation-comment
  (^js [signature]
   (.getDocumentationComment ^js signature))
  (^js [signature type-checker]
   (.getDocumentationComment ^js signature type-checker)))

(defn js-doc-tags
  ^js [signature]
  (.getJsDocTags ^js signature))
