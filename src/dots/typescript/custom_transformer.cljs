(ns dots.typescript.custom-transformer)

(defn transform-source-file
  ^js [custom-transformer node]
  (.transformSourceFile ^js custom-transformer node))

(defn transform-bundle
  ^js [custom-transformer node]
  (.transformBundle ^js custom-transformer node))
