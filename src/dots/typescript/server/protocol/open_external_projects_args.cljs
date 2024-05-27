(ns dots.typescript.server.protocol.open-external-projects-args
  "Arguments to OpenExternalProjectsRequest")

(defn projects
  "List of external projects to open or update
   
   **Returns:** `ExternalProject[]`"
  ^js [open-external-projects-args]
  (.-projects ^js open-external-projects-args))

(defn set-projects!
  "List of external projects to open or update"
  ^js [open-external-projects-args value]
  (set! (.-projects ^js open-external-projects-args) value))
