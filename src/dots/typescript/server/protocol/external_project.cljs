(ns dots.typescript.server.protocol.external-project
  "Represent an external project")

(defn project-file-name
  "Project name"
  ^js [external-project]
  (.-projectFileName ^js external-project))

(defn set-project-file-name!
  "Project name"
  ^js [external-project value]
  (set! (.-projectFileName ^js external-project) value))

(defn root-files
  "List of root files in project"
  ^js [external-project]
  (.-rootFiles ^js external-project))

(defn set-root-files!
  "List of root files in project"
  ^js [external-project value]
  (set! (.-rootFiles ^js external-project) value))

(defn options
  "Compiler options for the project"
  ^js [external-project]
  (.-options ^js external-project))

(defn set-options!
  "Compiler options for the project"
  ^js [external-project value]
  (set! (.-options ^js external-project) value))

(defn type-acquisition
  "Explicitly specified type acquisition for the project"
  ^js [external-project]
  (.-typeAcquisition ^js external-project))

(defn set-type-acquisition!
  "Explicitly specified type acquisition for the project"
  ^js [external-project value]
  (set! (.-typeAcquisition ^js external-project) value))
