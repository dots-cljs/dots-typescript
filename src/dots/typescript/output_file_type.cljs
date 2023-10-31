(ns dots.typescript.output-file-type
  (:require ["typescript" :as typescript]))

(def java-script (.-JavaScript typescript/OutputFileType))

(def source-map (.-SourceMap typescript/OutputFileType))

(def declaration (.-Declaration typescript/OutputFileType))
