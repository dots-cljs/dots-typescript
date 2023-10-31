(ns dots.typescript.highlight-span-kind
  (:require ["typescript" :as typescript]))

(def none (.-none typescript/HighlightSpanKind))

(def definition (.-definition typescript/HighlightSpanKind))

(def reference (.-reference typescript/HighlightSpanKind))

(def written-reference (.-writtenReference typescript/HighlightSpanKind))
