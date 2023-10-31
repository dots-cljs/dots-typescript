(ns dots.typescript.extension
  (:require ["typescript" :as typescript]))

(def ts (.-Ts typescript/Extension))

(def tsx (.-Tsx typescript/Extension))

(def dts (.-Dts typescript/Extension))

(def js (.-Js typescript/Extension))

(def jsx (.-Jsx typescript/Extension))

(def json (.-Json typescript/Extension))

(def ts-build-info (.-TsBuildInfo typescript/Extension))

(def mjs (.-Mjs typescript/Extension))

(def mts (.-Mts typescript/Extension))

(def dmts (.-Dmts typescript/Extension))

(def cjs (.-Cjs typescript/Extension))

(def cts (.-Cts typescript/Extension))

(def dcts (.-Dcts typescript/Extension))
