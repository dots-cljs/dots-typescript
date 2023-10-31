(ns dots.typescript.diagnostic-category
  (:require ["typescript" :as typescript]))

(def warning (.-Warning typescript/DiagnosticCategory))

(def error (.-Error typescript/DiagnosticCategory))

(def suggestion (.-Suggestion typescript/DiagnosticCategory))

(def message (.-Message typescript/DiagnosticCategory))
