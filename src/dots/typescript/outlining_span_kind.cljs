(ns dots.typescript.outlining-span-kind
  (:refer-clojure :exclude [comment])
  (:require ["typescript" :as typescript]))

(def comment
  "Single or multi-line comments"
  (.-Comment typescript/OutliningSpanKind))

(def region
  "Sections marked by '// #region' and '// #endregion' comments"
  (.-Region typescript/OutliningSpanKind))

(def code
  "Declarations and expressions"
  (.-Code typescript/OutliningSpanKind))

(def imports
  "Contiguous blocks of import declarations"
  (.-Imports typescript/OutliningSpanKind))
