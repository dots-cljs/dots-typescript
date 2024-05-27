(ns dots.typescript.organize-imports-args
  (:refer-clojure :exclude [type]))

(defn skip-destructive-code-actions?
  "**Returns:** `boolean | undefined`"
  ^js [organize-imports-args]
  (.-skipDestructiveCodeActions ^js organize-imports-args))

(defn set-skip-destructive-code-actions!
  ^js [organize-imports-args value]
  (set! (.-skipDestructiveCodeActions ^js organize-imports-args) value))

(defn mode
  "**Returns:** `OrganizeImportsMode | undefined`"
  ^js [organize-imports-args]
  (.-mode ^js organize-imports-args))

(defn set-mode!
  ^js [organize-imports-args value]
  (set! (.-mode ^js organize-imports-args) value))

(defn type
  "**Returns:** `\"file\"`"
  ^js [organize-imports-args]
  (.-type ^js organize-imports-args))

(defn set-type!
  ^js [organize-imports-args value]
  (set! (.-type ^js organize-imports-args) value))

(defn file-name
  "**Returns:** `string`"
  ^js [organize-imports-args]
  (.-fileName ^js organize-imports-args))

(defn set-file-name!
  ^js [organize-imports-args value]
  (set! (.-fileName ^js organize-imports-args) value))
