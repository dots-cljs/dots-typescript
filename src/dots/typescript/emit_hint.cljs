(ns dots.typescript.emit-hint
  (:require ["typescript" :as typescript]))

(def source-file (.-SourceFile typescript/EmitHint))

(def expression (.-Expression typescript/EmitHint))

(def identifier-name (.-IdentifierName typescript/EmitHint))

(def mapped-type-parameter (.-MappedTypeParameter typescript/EmitHint))

(def unspecified (.-Unspecified typescript/EmitHint))

(def embedded-statement (.-EmbeddedStatement typescript/EmitHint))

(def jsx-attribute-value (.-JsxAttributeValue typescript/EmitHint))
