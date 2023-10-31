(ns dots.typescript.internal-symbol-name
  (:refer-clojure :exclude [type])
  (:require ["typescript" :as typescript]))

(def call (.-Call typescript/InternalSymbolName))

(def constructor (.-Constructor typescript/InternalSymbolName))

(def new (.-New typescript/InternalSymbolName))

(def index (.-Index typescript/InternalSymbolName))

(def export-star (.-ExportStar typescript/InternalSymbolName))

(def global (.-Global typescript/InternalSymbolName))

(def missing (.-Missing typescript/InternalSymbolName))

(def type (.-Type typescript/InternalSymbolName))

(def object (.-Object typescript/InternalSymbolName))

(def jsx-attributes (.-JSXAttributes typescript/InternalSymbolName))

(def class (.-Class typescript/InternalSymbolName))

(def function (.-Function typescript/InternalSymbolName))

(def computed (.-Computed typescript/InternalSymbolName))

(def resolving (.-Resolving typescript/InternalSymbolName))

(def export-equals (.-ExportEquals typescript/InternalSymbolName))

(def default (.-Default typescript/InternalSymbolName))

(def this (.-This typescript/InternalSymbolName))
