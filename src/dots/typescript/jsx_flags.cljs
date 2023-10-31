(ns dots.typescript.jsx-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/JsxFlags))

(def intrinsic-named-element
  "An element from a named property of the JSX.IntrinsicElements interface"
  (.-IntrinsicNamedElement typescript/JsxFlags))

(def intrinsic-indexed-element
  "An element inferred from the string index signature of the JSX.IntrinsicElements interface"
  (.-IntrinsicIndexedElement typescript/JsxFlags))

(def intrinsic-element (.-IntrinsicElement typescript/JsxFlags))
