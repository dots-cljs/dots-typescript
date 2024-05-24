(ns dots.typescript.server.protocol.compile-on-save-affected-file-list-single-project
  "Contains a list of files that should be regenerated in a project")

(defn project-file-name
  "Project name"
  ^js [compile-on-save-affected-file-list-single-project]
  (.-projectFileName ^js compile-on-save-affected-file-list-single-project))

(defn set-project-file-name!
  "Project name"
  ^js [compile-on-save-affected-file-list-single-project value]
  (set! (.-projectFileName ^js compile-on-save-affected-file-list-single-project) value))

(defn file-names
  "List of files names that should be recompiled"
  ^js [compile-on-save-affected-file-list-single-project]
  (.-fileNames ^js compile-on-save-affected-file-list-single-project))

(defn set-file-names!
  "List of files names that should be recompiled"
  ^js [compile-on-save-affected-file-list-single-project value]
  (set! (.-fileNames ^js compile-on-save-affected-file-list-single-project) value))

(defn project-uses-out-file?
  "true if project uses outFile or out compiler option"
  ^js [compile-on-save-affected-file-list-single-project]
  (.-projectUsesOutFile ^js compile-on-save-affected-file-list-single-project))

(defn set-project-uses-out-file!
  "true if project uses outFile or out compiler option"
  ^js [compile-on-save-affected-file-list-single-project value]
  (set! (.-projectUsesOutFile ^js compile-on-save-affected-file-list-single-project) value))
