(ns dots.typescript.module-resolution-kind
  (:require ["typescript" :as typescript]))

(def classic (.-Classic typescript/ModuleResolutionKind))

(def node-js (.-NodeJs typescript/ModuleResolutionKind))

(def node-16 (.-Node16 typescript/ModuleResolutionKind))

(def node-next (.-NodeNext typescript/ModuleResolutionKind))
