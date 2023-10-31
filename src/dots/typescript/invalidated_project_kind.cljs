(ns dots.typescript.invalidated-project-kind
  (:require ["typescript" :as typescript]))

(def build (.-Build typescript/InvalidatedProjectKind))

(def update-bundle (.-UpdateBundle typescript/InvalidatedProjectKind))

(def update-output-file-stamps (.-UpdateOutputFileStamps typescript/InvalidatedProjectKind))
