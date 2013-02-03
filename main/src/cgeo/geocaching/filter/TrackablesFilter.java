package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.Geocache;
import cgeo.geocaching.cgeoapplication;

class TrackablesFilter extends AbstractFilter implements IFilterFactory {
    public TrackablesFilter() {
        super(cgeoapplication.getInstance().getString(R.string.caches_filter_track));
    }

    @Override
    public boolean accepts(Geocache cache) {
        return cache.hasTrackables();
    }

    @Override
    public IFilter[] getFilters() {
        return new IFilter[] { this };
    }

}
